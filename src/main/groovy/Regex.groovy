
/**
 * Created by Alex Corghencea on 05 September 2018.
 */
public class Regex {

    static void main(String[] args) {
        def project_version = "8.8.2.8.5-SNAPSHOT"



        def currentPatchResourcesDir = "patches/" + project_version
                .replace("-SNAPSHOT", "")
                .replaceFirst(/([0-9]*$)/, "x");
        println currentPatchResourcesDir;


    }

}
