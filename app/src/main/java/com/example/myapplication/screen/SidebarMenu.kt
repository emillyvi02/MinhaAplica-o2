package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.UbuntuFont

@Composable
fun SidebarMenu(
    modifier: Modifier = Modifier,
    onNavigate: (String) -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val profileGreen = Color(0xFF62B25F)
    val textColor = Color(0xFF353535)
    val subtitleColor = Color(0xFFAEAEAE)
    val logoutRed = Color(0xFFE7000B)
    val borderGray = Color(0xFFE5E7EB)

    val ubuntuFont = UbuntuFont

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.TopEnd
    ) {
        Column(
            modifier = Modifier
                .width(180.dp)
                .fillMaxHeight()
                .background(Color.White)
                .padding(vertical = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier.width(180.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    modifier = Modifier
                        .width(180.dp)
                        .height(40.dp)
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(9.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(profileGreen),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "JS",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier
                            .width(105.dp)
                            .height(25.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Olá, José Silva!",
                            fontFamily = ubuntuFont,
                            color = textColor,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            lineHeight = 12.sp,
                            maxLines = 1
                        )
                        Text(
                            text = "Matrícula: 202312345",
                            fontFamily = ubuntuFont,
                            color = subtitleColor,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Normal,
                            lineHeight = 8.sp,
                            maxLines = 1
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .width(180.dp)
                        .height(510.dp)
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    DrawerNavItem(title = "Meu Perfil", onClick = { onNavigate("perfil") })
                    DrawerNavItem(title = "Histórico de Refeições", onClick = { onNavigate("historico") })
                    DrawerNavItem(title = "Configurações", onClick = { onNavigate("configuracoes") })
                    DrawerNavItem(title = "Ajuda e Suporte", onClick = { onNavigate("ajuda") })
                }
            }

            Column(
                modifier = Modifier
                    .width(180.dp)
                    .height(57.dp)
                    .border(
                        width = 0.8.dp,
                        color = borderGray
                    ),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clickable { onLogout() }
                        .padding(horizontal = 24.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.09.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                        contentDescription = "Sair",
                        tint = logoutRed,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "Sair",
                        color = logoutRed,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 24.sp
                    )
                }
            }
        }
    }
}

@Composable
fun DrawerNavItem(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        color = Color(0xFF353535),
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 4.dp)
    )
}

@Preview
@Composable
private fun SidebarMenuPreview() {
    MyApplicationTheme {
        SidebarMenu()
    }
}
