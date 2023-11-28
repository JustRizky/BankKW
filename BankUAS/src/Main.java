import ModelJSON.ModelJSONUser;
import Node.NodeUser;
import com.github.cliftonlabs.json_simple.JsonArray;
import org.w3c.dom.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ModelJSON.ModelJSONUser modelJSONUser = new ModelJSON.ModelJSONUser();
        System.out.println(modelJSONUser.cekFile());

        ArrayList<NodeUser> listUser2 = new ArrayList<>();
        listUser2.add(new NodeUser(1, "Rangga", "07607", "07607"));
        listUser2.add(new NodeUser(2, "Rizky", "07606", "07606"));
        listUser2.add(new NodeUser(3, "Panji", "07602", "07602"));
        JsonArray arrayUser2 = modelJSONUser.convertArrayListToArrayJSON(listUser2);
        System.out.println("Output Array User2 : " + arrayUser2);
    }
}