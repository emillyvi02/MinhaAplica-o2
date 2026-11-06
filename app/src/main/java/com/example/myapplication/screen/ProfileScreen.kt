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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.UbuntuFont

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {}
) {
    val ubuntuFont = UbuntuFont
    val avatarGradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF2E7D32), Color(0xFF62B25F))
    )
    val buttonGreen = Color(0xFF2A9626)
    val lineBorderColor = Color(0xFFCAC9C9)
    val textDarkColor = Color(0xFF1F2937)
    val placeholderColor = Color(0xFF9CA3AF)
    val alertBgColor = Color.White
    val alertBorderColor = Color(0xFFCAC9C9)
    val warningYellow = Color(0xFFFFB42A)

    val scrollState = rememberScrollState()

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
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalAlignment = Alignment.Start
            ) {
                // 1. Cabeçalho com Título "Meu Perfil" Centralizado
                Row(
                    modifier = Modifier
                        .width(296.dp)
                        .height(40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(24.dp)
                            .clickable { onBack() }
                    )
                    Text(
                        text = "Meu Perfil",
                        fontFamily = ubuntuFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = textDarkColor,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                }

                // 2. Avatar "JS" com Gradiente e Nome/Matrícula Centralizados
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(avatarGradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "JS",
                            fontFamily = ubuntuFont,
                            color = Color.White,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            text = "João Silva",
                            fontFamily = ubuntuFont,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = textDarkColor
                        )
                        Text(
                            text = "Matrícula: 2024001234",
                            fontFamily = ubuntuFont,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF6B7280)
                        )
                    }
                }

                // 3. Campos de Formulário
                Column(
                    modifier = Modifier.width(296.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    // Nome completo
                    Column(
                        modifier = Modifier.width(296.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Nome completo:",
                            fontFamily = ubuntuFont,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = textDarkColor
                        )
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .heightIn(min = 32.dp)
                                .background(Color.Transparent, shape = RoundedCornerShape(5.dp))
                                .padding(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = "João Silva",
                                fontFamily = ubuntuFont,
                                fontSize = 14.sp,
                                color = placeholderColor
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .height(2.dp)
                                .background(lineBorderColor)
                        )
                    }

                    // E-mail
                    Column(
                        modifier = Modifier.width(296.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "E-mail:",
                            fontFamily = ubuntuFont,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = textDarkColor
                        )
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .heightIn(min = 32.dp)
                                .background(Color.Transparent, shape = RoundedCornerShape(5.dp))
                                .padding(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = "joao.silva@ifome.edu.br",
                                fontFamily = ubuntuFont,
                                fontSize = 14.sp,
                                color = placeholderColor
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .height(2.dp)
                                .background(lineBorderColor)
                        )
                    }

                    // Telefone
                    Column(
                        modifier = Modifier.width(296.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Telefone:",
                            fontFamily = ubuntuFont,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = textDarkColor
                        )
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .heightIn(min = 32.dp)
                                .background(Color.Transparent, shape = RoundedCornerShape(5.dp))
                                .padding(horizontal = 14.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = "(11) 98765-4321",
                                fontFamily = ubuntuFont,
                                fontSize = 14.sp,
                                color = placeholderColor
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(296.dp)
                                .height(2.dp)
                                .background(lineBorderColor)
                        )
                    }
                }

                // 4. Seção de Restrições/Preferências Alimentares (Chips)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    val tagsRow1 = listOf("Vegano" to false, "Vegetariano" to false)
                    val tagsRow2 = listOf("Sem Glúten" to false, "Sem Lactose" to true)
                    val tagsRow3 = listOf("Alérgico a Amendoim" to false, "Alérgico a Peixe" to false)

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        tagsRow1.forEach { tag ->
                            PreferenceChip(text = tag.first, isSelected = tag.second, ubuntuFont = ubuntuFont)
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        tagsRow2.forEach { tag ->
                            PreferenceChip(text = tag.first, isSelected = tag.second, ubuntuFont = ubuntuFont)
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        tagsRow3.forEach { tag ->
                            PreferenceChip(text = tag.first, isSelected = tag.second, ubuntuFont = ubuntuFont)
                        }
                    }
                }

                // 5. Campo "Outros"
                Column(
                    modifier = Modifier
                        .width(296.dp)
                        .height(182.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = "Outros",
                        fontFamily = ubuntuFont,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF4A5565)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .border(width = 0.8.dp, color = Color(0xFFE5E7EB), shape = RoundedCornerShape(8.dp))
                            .padding(14.dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Text(
                            text = "Descreva outras restrições ou alergias específicas",
                            fontFamily = ubuntuFont,
                            fontSize = 13.sp,
                            color = placeholderColor
                        )
                    }
                }

                // 6. Alerta Nutricional
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 0.8.dp, color = alertBorderColor, shape = RoundedCornerShape(14.dp))
                        .background(alertBgColor, shape = RoundedCornerShape(14.dp))
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(warningYellow),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Warning,
                            contentDescription = "Aviso",
                            tint = Color.White,
                            modifier = Modifier.size(15.dp)
                        )
                    }

                    Text(
                        text = "Essas informações são enviadas à equipe de nutrição para garantir que o cardápio seja inclusivo para você.",
                        fontFamily = ubuntuFont,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF4B5563),
                        lineHeight = 15.sp,
                        modifier = Modifier.weight(1f)
                    )
                }

                // 7. Botão "Editar Preferências"
                Box(
                    modifier = Modifier
                        .width(296.dp)
                        .height(32.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(buttonGreen)
                        .clickable { },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Editar Preferências",
                        fontFamily = ubuntuFont,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

// Componente de Chip de Preferências Alimentares
@Composable
fun PreferenceChip(
    text: String,
    isSelected: Boolean,
    ubuntuFont: FontFamily,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val borderColor = Color(0xFFE5E7EB)
    val selectedBg = Color(0xFF2A9626)
    val unselectedBg = Color.White
    val textColor = if (isSelected) Color.White else Color(0xFF4A5565)

    Box(
        modifier = modifier
            .height(36.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(if (isSelected) selectedBg else unselectedBg)
            .border(width = 1.5.dp, color = if (isSelected) selectedBg else borderColor, shape = RoundedCornerShape(20.dp))
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontFamily = ubuntuFont,
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            color = textColor
        )
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    MyApplicationTheme {
        ProfileScreen()
    }
}

