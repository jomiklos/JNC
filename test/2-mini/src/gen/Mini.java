/* 
 * @(#)Mini.java        1.0 4/7/12
 *
 * This file has been auto-generated by JPyang, the Java output format plug-in
 * of pyang. Origin: module "mini", revision: "unknown".
 */

package gen;

import com.tailf.confm.*;
import com.tailf.inm.*;
import java.util.Hashtable;

/**
 * The root class for namespace http://exampleCom/ns/mini/10 (accessible from 
 * Mini.NAMESPACE) with prefix "mini" (Mini.PREFIX).
 *
 * @version    1.0 2012-7-4
 * @author    Auto Generated
 */
public class Mini {

    public static final String NAMESPACE = "http://example.com/ns/mini/1.0";

    public static final String PREFIX = "mini";
    
    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws NetconfException {
        Container.setPackage(NAMESPACE, PREFIX);
        Mini.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws NetconfException {
        StackTraceElement[] sTrace = (new Exception()).getStackTrace();
        ClassLoader loader = sTrace[0].getClass().getClassLoader();
        java.net.URL schemaUrl = loader.getSystemResource("Mini.schema");
        SchemaParser parser = new SchemaParser();
        Hashtable h = CsTree.create(NAMESPACE);
        if (schemaUrl == null)
            parser.readFile("Mini.schema", h);
        else
            parser.readFile(schemaUrl, h);
    }

}