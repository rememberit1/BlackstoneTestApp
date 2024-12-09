package com.example.blackstonetestapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.example.blackstonetestapp.data.PatientViewModel
import com.example.blackstonetestapp.data.ViewVariables
import com.example.blackstonetestapp.ui.theme.BlackstoneTestAppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlackstoneTestAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ItemsView()
                }
            }
        }
    }

    private fun getItemData(viewModel: PatientViewModel) {
        lifecycleScope.launch {
            viewModel.getData()
        }
    }


    @Composable
    fun ItemsView(modifier: Modifier = Modifier, viewModel: PatientViewModel = PatientViewModel()) {

        getItemData(viewModel)
        Column(
            modifier = modifier
                .padding(12.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(bottom = 12.dp),
                text = ViewVariables.APP_TITLE,
                fontSize = ViewVariables.LARGE_FONT
            )
            val allData =
                viewModel.patient.observeAsState().value
            allData?.let {
                Text(
                    text = "NAME: ${it.name.first().given.last()} ${it.name.first().family}",
                    fontSize = ViewVariables.SMALL_FONT,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                )
                Text(
                    text = "GENDER: ${it.gender}",
                    fontSize = ViewVariables.SMALL_FONT,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                )
                Text(
                    text = "WORK PHONE: ${it.telecom[1].value}",
                    fontSize = ViewVariables.SMALL_FONT,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                )
                Text(
                    text = "ADDRESS: ${it.address[0].text}",
                    fontSize = ViewVariables.SMALL_FONT,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                )

                Text(
                    text = "BIRTHDAY: ${it.birthDate}",
                    fontSize = ViewVariables.SMALL_FONT,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                )

            }


        }
    }


}
