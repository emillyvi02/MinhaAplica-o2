package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun SplashScreen(
    modifier: Modifier = Modifier
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .width(119.dp)
                .height(160.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            val ifalGreen = Color(0xFF2A9626)
            val ifalRed = Color(0xFFD32F2F)


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LogoCircleBlock(color = ifalRed)
                LogoBlock(color = ifalGreen)
                LogoBlock(color = ifalGreen)
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LogoBlock(color = ifalGreen)
                Spacer(modifier = Modifier.width(10.dp))
                LogoBlock(color = ifalGreen)
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LogoBlock(color = ifalGreen)
                LogoBlock(color = ifalGreen)
                LogoBlock(color = ifalGreen)
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LogoBlock(color = ifalGreen)
                Spacer(modifier = Modifier.width(10.dp))
                LogoBlock(color = ifalGreen)
            }
        }
    }

}

@Composable
fun LogoCircleBlock(color: Color) {
    TODO("Not yet implemented")
}

@Composable
fun LogoBlock(color: Color) {
    TODO("Not yet implemented")
}

@Preview
@Composable
private fun SplashScreenPreview() {
    MyApplicationTheme {
        SplashScreen()
    }
}

