package p8.example.bd;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String password,int age, Response.Listener<String>listener){
        super(Request.Method.POST, REGISTER_REQUEST_URL,listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("password",password);
        params.put("age",age+"");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
