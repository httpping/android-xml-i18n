package netlog.tanping.com.i18nlib.util;

import java.io.File;
import java.util.HashMap;

public class FileParse {

    /**
     * 解析
     * @param rootPath
     * @return
     */
    public static HashMap<String,String> parse(String rootPath){

        File file =new File(rootPath);

        File[] files =  file.listFiles();
        HashMap<String,String> maps = new HashMap<String, String>();

        for (File valuesI18 : files){
            String pathName = valuesI18.getName();
            if (pathName.contains("values")){

                File[] strings = valuesI18.listFiles();

                for (File string :strings){
                    String fileName= string.getName();
                    if ("strings.xml".equals(fileName)){
                        String lang =pathName.replace("values-","");
                        if (!lang.equals("values")){
                            maps.put(lang,  string.getPath());
                        }else {
                            maps.put("default", string.getPath());
                        }
                        break;
                    }

                }



            }
        }
        return maps;
    }
}
