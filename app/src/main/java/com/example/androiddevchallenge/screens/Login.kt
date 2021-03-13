/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.LoginField
import com.example.androiddevchallenge.components.MainButton
import com.example.androiddevchallenge.components.NoAccountRow
import com.example.androiddevchallenge.components.PatternBackground
import com.example.androiddevchallenge.components.Title
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Login(navController: NavController = rememberNavController()) {
    var titleLogIn = stringResource(id = R.string.button_login)
    var inputEmail = stringResource(id = R.string.input_email)
    var inputPassword = stringResource(id = R.string.input_password)
    var patternId = if (isSystemInDarkTheme()) R.drawable.ic_login_dark else R.drawable.ic_login
    PatternBackground(resourceId = patternId) {
        Column(
            Modifier
                .padding(16.dp, 0.dp)
                .fillMaxWidth()
        ) {
            Title(title = titleLogIn, modifier = Modifier.height(200.dp))
            Spacer(Modifier.size(32.dp))
            LoginField(inputEmail)
            Spacer(Modifier.size(8.dp))
            LoginField(inputPassword)
            Spacer(Modifier.size(8.dp))
            MainButton(
                title = titleLogIn,
                onClick = {
                    navController.navigate("home")
                }
            )
            NoAccountRow()
        }
    }
}

@Preview("Login Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginLightPreview() {
    MyTheme {
        Login()
    }
}

@Preview("Login Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginDarkPreview() {
    MyTheme(darkTheme = true) {
        Login()
    }
}
