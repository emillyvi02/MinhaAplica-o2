package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.BalooFont
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.UbuntuFont

@Composable
fun SelectionContextScreen(
    modifier: Modifier = Modifier,
    onClickContext: () -> Unit = {}
) {
    val ifalGreen = Color(0xFF2A9626)
    val subtitleColor = Color(0xFF364153)

    val balooFont = BalooFont
    val ubuntuFont = UbuntuFont

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.width(296.dp),
            verticalArrangement = Arrangement.spacedBy(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "IFome",
                    modifier = Modifier.height(49.dp),
                    fontFamily = balooFont,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = ifalGreen,
                    lineHeight = 32.sp
                )

                Text(
                    text = "Modo de demonstração da Etapa 01",
                    fontFamily = ubuntuFont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    lineHeight = 16.sp
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Escolha o contexto",
                        fontFamily = ubuntuFont,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        lineHeight = 22.sp,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Text(
                        text = "Selecione o perfil que será demonstrado.",
                        fontFamily = ubuntuFont,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        color = subtitleColor,
                        lineHeight = 11.sp
                    )
                }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { onClickContext() },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF62B25F))
                    ) {
                        Text(text = "Consumidor")
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF62B25F))
                    ) {
                        Text(text = "Administração")
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF62B25F))
                    ) {
                        Text(text = "Cantina")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun SelectionContextScreenPreview() {
    MyApplicationTheme {
        SelectionContextScreen(onClickContext = {})
    }
}
