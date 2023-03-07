package br.senai.sp.jandira.loginandsignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginandsignup.ui.theme.LoginAndSignUpTheme

class SingUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAndSignUpTheme {
                SingUp()
            }
        }
    }
}


@Preview(showBackground = false, showSystemUi = true)
@Composable
fun SingUp() {

    var defaultColor = colorResource(id = R.color.default_color)

    var userNameState = rememberSaveable {
        mutableStateOf("")
    }

    var phoneState = rememberSaveable {
        mutableStateOf("")
    }

    var emailState = rememberSaveable {
        mutableStateOf("")
    }

    var passwordState = rememberSaveable {
        mutableStateOf("")
    }

    var checkBoxState = rememberSaveable{
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(120.dp)
                        .background(
                            defaultColor,
                            shape = RoundedCornerShape(bottomStart = 16.dp)
                        )
                )
            }

            Spacer(modifier = Modifier.height(47.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700),
                    color = defaultColor
                )
                Text(
                    text = "Create a new account",
                    fontSize = 14.sp,
                    color = Color(160, 156, 156)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = userNameState.value,
                    onValueChange = {
                        userNameState.value = it
                    },
                    label = { Text(text = "Username") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_person_24
                            ),
                            contentDescription = "Username",
                            tint = defaultColor
                        )
                    },
                    modifier = Modifier
                        .width(370.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = phoneState.value,
                    onValueChange = {
                        phoneState.value = it
                    },
                    label = { Text(text = "Phone") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_phone_android_24
                            ),
                            contentDescription = "phone",
                            tint = defaultColor
                        )
                    },
                    modifier = Modifier
                        .width(370.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    visualTransformation = PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = { Text(text = "E-mail") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_email_24
                            ),
                            contentDescription = "Email",
                            tint = defaultColor
                        )
                    },
                    modifier = Modifier
                        .width(370.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = passwordState.value,
                    onValueChange = {
                        passwordState.value = it
                    },
                    label = { Text(text = "Password") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_lock_24
                            ),
                            contentDescription = "Lock",
                            tint = defaultColor
                        )
                    },
                    modifier = Modifier
                        .width(370.dp)
                        .height(58.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }
            Spacer(modifier = Modifier.height(31.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = false, onCheckedChange = {})
                Text(text = "Over 18?",
                fontSize = 14.sp,
                fontWeight = FontWeight(400))
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.End
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(defaultColor),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700)
                    )


                }
                Spacer(modifier = Modifier.height(31.dp))
                Row() {
                    Text(
                        text = "Don’t have an account?",
                        fontSize = 12.sp,
                        color = Color(168, 156, 156),
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Sign Up",
                        modifier = Modifier
                            .clickable { },
                        fontSize = 12.sp,
                        color = defaultColor,
                        fontWeight = FontWeight(700)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.Bottom
            ) {
                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(120.dp)
                        .background(
                            defaultColor,
                            shape = RoundedCornerShape(topEnd = 16.dp)
                        )
                )
            }

        }

    }
}