package com.lafaDD.ssomai

import com.lafaDD.ssomai.R
import android.os.Bundle
import android.graphics.Color;
import android.view.View
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lafaDD.ssomai.ui.theme.SSOMAITheme

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainLayout: LinearLayout
    private lateinit var changeColorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLayout = findViewById(R.id.mainLayout)
        changeColorButton = findViewById(R.id.changeColorButton)

        changeColorButton.setOnClickListener {
            changeBackgroundColor()
        }
    }

    private fun changeBackgroundColor() {
        // Generate a random color or set a predefined color
        val color = Color.rgb(
            (Math.random() * 255).toInt(),
            (Math.random() * 255).toInt(),
            (Math.random() * 255).toInt()
        )

        // Change the background color of the layout
        mainLayout.setBackgroundColor(color)
    }
}