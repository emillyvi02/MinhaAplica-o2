package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.domain.model.MenuItem
import com.example.myapplication.ui.theme.BalooFont
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.UbuntuFont

@Composable
fun ConsumerHomeScreen(
    modifier: Modifier = Modifier,
    onOpenMenu: () -> Unit = {}
) {
    val ifalGreen = Color(0xFF2A9626)
    val alertYellowBg = Color.White
    val alertYellowBorder = Color(0xFFD0FAE5)
    val alertTextTitle = Color(0xFFFFB42A)
    val alertTextDesc = Color(0xFF4B5563)
    val cardGreenBg = Color(0xFF2A9626)
    val cardGreenText = Color(0xFF62B25F)
    val cardSubtitleColor = Color(0xFFD0FAE5)
    val itemSubColor = Color(0xFF9CA3AF)
    val dividerColor = Color(0xFFCAC9C9)
    val cardapioTitleColor = Color(0xFF777777)

    val balooFont = BalooFont
    val ubuntuFont = UbuntuFont

    val menuItems = listOf(
        MenuItem("Pizza", "Massa, molho de tomate, queijo, pepperoni", dividerColor),
        MenuItem("Bolo de Chocolate", "Farinha, açúcar, chocolate em pó, ovos, manteiga", dividerColor),
        MenuItem("Sopa de Legumes", "Cenoura, batata, cebola, abobrinha, caldo de galinha", dividerColor),
        MenuItem("Tacos", "Tortilhas, carne moída, alface, tomate, queijo", dividerColor),
        MenuItem("Salada Caesar", "Alface, croutons, queijo parmesão, molho Caesar", dividerColor),
        MenuItem("Espaguete à Carbonara", "Espaguete, ovos, queijo pecorino, pancetta, pimenta", dividerColor)
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(360.dp)
                .fillMaxHeight()
                .background(Color.White)
                .padding(horizontal = 32.dp, vertical = 36.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .width(296.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    modifier = Modifier
                        .width(296.dp)
                        .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "IFome",
                        fontFamily = balooFont,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Normal,
                        color = ifalGreen,
                        lineHeight = 28.sp
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notificações",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp)
                                .clickable { }
                        )
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu Lateral",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(26.dp)
                                .clickable { onOpenMenu() }
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .width(296.dp)
                        .weight(1f),
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier
                            .width(296.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .border(width = 0.8.dp, color = alertYellowBorder, shape = RoundedCornerShape(14.dp))
                            .background(alertYellowBg)
                            .padding(horizontal = 16.dp, vertical = 14.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .size(26.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFFFB42A)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = "Aviso",
                                tint = Color.White,
                                modifier = Modifier.size(16.dp)
                            )
                        }

                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "Aviso Importante",
                                fontFamily = ubuntuFont,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = alertTextTitle
                            )
                            Text(
                                text = "O Restaurante Universitário estará fechado nesta sexta-feira devido ao feriado nacional.",
                                fontFamily = ubuntuFont,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                color = alertTextDesc,
                                lineHeight = 16.sp
                            )
                        }
                    }

                    Column(
                        modifier = Modifier
                            .width(296.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(cardGreenBg)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "Você vai comer no RU hoje?",
                                fontFamily = ubuntuFont,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "Confirme para nos ajudar a reduzir o desperdício de alimentos.",
                                fontFamily = ubuntuFont,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                color = cardSubtitleColor,
                                lineHeight = 16.sp
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(38.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White)
                                .clickable { },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Confirmar Refeição",
                                fontFamily = ubuntuFont,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = cardGreenText
                            )
                        }
                    }

                    Column(
                        modifier = Modifier
                            .width(296.dp)
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Cardápio do Dia",
                            modifier = Modifier.offset(x = (-4).dp),
                            fontFamily = ubuntuFont,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = cardapioTitleColor,
                            lineHeight = 20.sp,
                            textAlign = TextAlign.Start
                        )

                        LazyColumn(
                            modifier = Modifier
                                .width(296.dp)
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            horizontalAlignment = Alignment.Start
                        ) {
                            items(menuItems) { item ->
                                Column(
                                    modifier = Modifier
                                        .width(296.dp)
                                        .padding(bottom = 4.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(
                                            modifier = Modifier.weight(1f),
                                            verticalArrangement = Arrangement.spacedBy(2.dp)
                                        ) {
                                            Text(
                                                text = item.name,
                                                fontFamily = ubuntuFont,
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = Color.Black,
                                                lineHeight = 14.sp
                                            )
                                            Text(
                                                text = item.description,
                                                fontFamily = ubuntuFont,
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = itemSubColor,
                                                maxLines = 1
                                            )
                                        }

                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "Favoritar",
                                            tint = itemSubColor,
                                            modifier = Modifier
                                                .size(20.dp)
                                                .clickable { }
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(2.dp)
                                            .background(item.dividerColor)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun ConsumerHomeScreenPreview() {
    MyApplicationTheme {
        ConsumerHomeScreen()
    }
}
