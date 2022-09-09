package ca.georgiancollege.comp3025_f2022_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    // LifeCycle Function
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val HelloWorldLabel = findViewById(R.id.Hello_World_Label) as TextView

        
    }
}