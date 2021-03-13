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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.Logo
import com.example.androiddevchallenge.components.MainButton
import com.example.androiddevchallenge.components.PatternBackground
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Welcome(navController: NavController = rememberNavController()) {
    var titleSignUp = stringResource(id = R.string.button_signup)
    var titleLogIn = stringResource(id = R.string.button_login)
    var patternId = if (isSystemInDarkTheme()) R.drawable.ic_welcome_dark else R.drawable.ic_welcome
    PatternBackground(resourceId = patternId) {
        Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
            Column(
                Modifier
                    .padding(16.dp, 0.dp)
                    .fillMaxWidth()
            ) {
                Logo()
                Spacer(Modifier.size(32.dp))
                MainButton(title = titleSignUp, onClick = {})
                Spacer(Modifier.size(8.dp))
                MainButton(
                    title = titleLogIn,
                    onClick = {
                        navController.navigate("login")
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary
                    )
                )
            }
        }
    }
}

@Preview("Welcome Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeLightPreview() {
    MyTheme {
        Welcome()
    }
}

@Preview("Welcome Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomeDarkPreview() {
    MyTheme(darkTheme = true) {
        Welcome()
    }
}
