package ModelJSON;

import Node.*;
import NodeJSON.NodeJSONUser;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.File;
import java.util.ArrayList;

public class ModelJSONUser {
    String fname = "src/Database/DatabaseUser.json";

    public boolean cekFile(){
        boolean cek = false;
        try {
            File file = new File(fname);
            if(file.exists()){
                cek = true;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return cek;
    }

    public JsonArray convertArrayListToArrayJSON(ArrayList<NodeUser> listUser){
        if (listUser==null){
            return null;
        }else{
            JsonArray arrayUser = new JsonArray();
            for (NodeUser user:listUser) {
                JsonObject objUser = new JsonObject();
                objUser.put("PK ", user.pk);
                objUser.put("Nama ", user.namaPengguna);
                objUser.put("Nomor Rekening ", user.noRek);
                objUser.put("PIN ", user.pin);
                arrayUser.add(objUser);

            }
            return arrayUser;
        }
    }
}