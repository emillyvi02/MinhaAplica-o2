package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myapplication.navigation.NavHost
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme{
                NavHost()
            }
        }
    }
}
          /*  var currentScreen by remember { mutableStateOf("splash") }


            when (currentScreen) {

                "consumer_home" -> {
                    ConsumerHomeScreen(
                        onOpenMenu = {
                            currentScreen = "sidebar_menu"
                        }
                    )
                }
                "sidebar_menu" -> {
                    SidebarMenu(
                        onNavigate = { route ->
                            if (route == "perfil") {
                                currentScreen = "profile_screen"
                            }
                        },
                        onLogout = {
                            currentScreen = "context_selection"
                        }
                    )
                }
                "profile_screen" -> {
                    ProfileScreen(
                        onBack = {
                            currentScreen = "consumer_home"
                        }
                    )
                }
            }
        }
    }
}



// --- TELA HOME CONSUMIDOR ---
@Composable
fun ConsumerHomeScreen(
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


    val balooFont = FontFamily(Font(R.font.baloo_thambi_extrabold))
    val ubuntuFont = FontFamily(Font(R.font.ubuntu_regular))


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(800.dp)
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
                        .fillMaxHeight(),
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
                            .fillMaxHeight(),
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


                        val menuItems = listOf(
                            Triple("Pizza", "Massa, molho de tomate, queijo, pepperoni", dividerColor),
                            Triple("Bolo de Chocolate", "Farinha, açúcar, chocolate em pó, ovos, manteiga", dividerColor),
                            Triple("Sopa de Legumes", "Cenoura, batata, cebola, abobrinha, caldo de galinha", dividerColor),
                            Triple("Tacos", "Tortilhas, carne moída, alface, tomate, queijo", dividerColor),
                            Triple("Salada Caesar", "Alface, croutons, queijo parmesão, molho Caesar", dividerColor),
                            Triple("Espaguete à Carbonara", "Espaguete, ovos, queijo pecorino, pancetta, pimenta", dividerColor)
                        )


                        LazyColumn(
                            modifier = Modifier
                                .width(296.dp)
                                .fillMaxHeight(),
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
                                                text = item.first,
                                                fontFamily = ubuntuFont,
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = Color.Black,
                                                lineHeight = 14.sp
                                            )
                                            Text(
                                                text = item.second,
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
                                            .background(item.third)
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


// --- TELA DE MENU LATERAL (SIDEBAR NA LATERAL DIREITA) ---
@Composable
fun SidebarMenu(
    onNavigate: (String) -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val profileGreen = Color(0xFF62B25F)
    val textColor = Color(0xFF353535)
    val subtitleColor = Color(0xFFAEAEAE)
    val logoutRed = Color(0xFFE7000B)
    val borderGray = Color(0xFFE5E7EB)


    val ubuntuFont = FontFamily(Font(R.font.ubuntu_regular))


    Box(
        modifier = Modifier
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
fun DrawerNavItem(title: String, onClick: () -> Unit) {
    Text(
        text = title,
        color = Color(0xFF353535),
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 4.dp)
    )
}


// --- TELA DE PERFIL (C20 · Perfil) ---
@Composable
fun ProfileScreen(
    onBack: () -> Unit = {}
) {
    val ubuntuFont = FontFamily(Font(R.font.ubuntu_regular))
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
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(360.dp)
                .fillMaxHeight()
                .background(Color.White)
                .padding(horizontal = 32.dp, vertical = 36.dp), // 36px superior e inferior conforme especificado
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .width(296.dp)
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(40.dp), // Espaço de 40px entre os elementos
                horizontalAlignment = Alignment.Start
            ) {
                // 1. Cabeçalho com Título " Meu Perfil" Centralizado
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
                    modifier = Modifier
                        .width(296.dp),
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


                // 5. Campo "Outros" (Frame 146 ajustado com largura 296px, altura envolver de 182px, cor de texto #4A5565 e borda #E5E7EB)
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
                        color = Color(0xFF4A5565) // Cor do texto atualizada para #4A5565
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .border(width = 0.8.dp, color = Color(0xFFE5E7EB), shape = RoundedCornerShape(8.dp)) // Cor da borda atualizada para #E5E7EB
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


                // 7. Botão "Editar Preferências" (296px x 32px, raio 5.dp)
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
fun PreferenceChip(text: String, isSelected: Boolean, ubuntuFont: FontFamily) {
    val borderColor = Color(0xFFE5E7EB)
    val selectedBg = Color(0xFF2A9626)
    val unselectedBg = Color.White
    val textColor = if (isSelected) Color.White else Color(0xFF4A5565)


    Box(
        modifier = Modifier
            .height(36.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(if (isSelected) selectedBg else unselectedBg)
            .border(width = 1.5.dp, color = if (isSelected) selectedBg else borderColor, shape = RoundedCornerShape(20.dp))
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


@Composable
fun LogoCircleBlock(color: Color) {
    Box(
        modifier = Modifier
            .size(33.dp)
            .clip(CircleShape)
            .background(color)
    )
}


@Composable
fun LogoBlock(color: Color) {
    Box(
        modifier = Modifier
            .size(33.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(color)
    )
}

*/