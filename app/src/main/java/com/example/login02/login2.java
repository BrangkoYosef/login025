package com.example.login02;

public class login2 {
    setContetView(R.layout.activity_main);

    txtUsername = findViewByID(R.id.txtusername);
    //txtPassword = findViewByID(R.id.txtPassword);
    btnLogin = findViewByID(R.id.btnlogin);
    //tvDaftare = findViewByID(R.id.tvDaftar);

    if((user.equals(username)) && (pass.equals(password))){
        Toast.makeText( context: this, text: "Sukses Login". Toast.LENGTH_SHORT).SHOW()
                helper.setUsername(user);
        startActivity(new Intent(packageContext: this, Dashboard.class));

    }else{
        Toast.makeText(context: this, text:"Gagal Login",Toast.LENGTH_SHORT.shoe();
    }

}
