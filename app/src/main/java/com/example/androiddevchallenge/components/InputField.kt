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
package com.example.androiddevchallenge.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.black800
import com.example.androiddevchallenge.ui.theme.gray800
import com.example.androiddevchallenge.ui.theme.white800

@Composable
fun InputField(label: String, textColor: Color, modifier: Modifier = Modifier, icon: @Composable (() -> Unit)? = null) {
    var background = if (isSystemInDarkTheme()) MaterialTheme.colors.surface else MaterialTheme.colors.onPrimary
    var text by remember { mutableStateOf("") }
    var offsetPlaceholder = if (icon != null) 40.dp else 24.dp
    Box(modifier.height(56.dp)) {
        TextField(
            leadingIcon = icon,
            value = text,
            onValueChange = { text = it },
            maxLines = 1,
            shape = MaterialTheme.shapes.small,
            textStyle = MaterialTheme.typography.body1,
            modifier = Modifier.fillMaxSize(),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = background,
                textColor = textColor
            )
        )
        // Makes label/placeholder centered correctly
        if (text.isEmpty()) {
            Row(
                Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    label,
                    style = MaterialTheme.typography.body1,
                    color = textColor,
                    modifier = Modifier.padding(offsetPlaceholder, 0.dp)
                )
            }
        }
    }
}

@Composable
fun LoginField(label: String) {
    var textColor = if (isSystemInDarkTheme()) white800 else gray800
    InputField(label, textColor)
}

@Composable
fun SearchField() {
    var searchLabel = stringResource(id = R.string.input_search)
    var textColor = if (isSystemInDarkTheme()) white800 else black800
    InputField(
        searchLabel,
        textColor,
        modifier = Modifier.padding(16.dp, 0.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            tint = textColor,
            contentDescription = searchLabel,
            modifier = Modifier.size(18.dp, 18.dp)
        )
    }
}
