
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AS
 */
public class GetSetPath {
    public static File sFile;
    public void setFilePath(File file){
        sFile = file;
    }
    public File getFilePath(){
        return sFile;
    }
}
