/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author prasetia
 */
public class BaseUtil {

    /**
     *
     * @param ex
     */
    public static void errorTrackingApp(Exception ex)
    {
        System.err.println("Aplikasi Error" + ex);
    }
}
