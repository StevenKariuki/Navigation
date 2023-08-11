package com.example.navigation.ui.theme.navigationdrawer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.example.navigation.ui.theme.bottomnavigation.bottomNaviagtionItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerLayout() {
    val coroutineScope = rememberCoroutineScope()

    ModalDrawerSheet(
        Modifier
            .wrapContentSize()
    ) {
        Spacer(Modifier.height(12.dp))
        bottomNaviagtionItems.forEach { item ->
            NavigationDrawerItem(
                modifier = Modifier
                    .padding(NavigationDrawerItemDefaults.ItemPadding),
                icon = {
                    Icon(
                        painter = rememberVectorPainter(image = item.icon),
                        contentDescription = null
                    )
                },
                label = { Text(item.name )},
                onClick = {
                },
                selected = false
            )
        }
    }
}



