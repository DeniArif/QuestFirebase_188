package com.example.myapplication.ui.navigasi

import androidx.compose.runtime.Composable
import com.example.myapplication.view.HomeScreen
import java.lang.reflect.Modifier

@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    )  {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiInsert.route)
                },
            )
        }
        composable(DestinasiInsert.route) {
            InsertMhsView(
                onBack = {navController.popBackStack()},
                onNavigate = {navController.navigate(DestinasiHome.route)}
            )
        }
    }
}