package ru.sberbank.school.exceptions.returncode;

import static ru.sberbank.school.exceptions.returncode.UglyExample.ReturnCodes.E_OK;

public class UglyExample {

    public static void main(String[] args) {
        Page page = new Page();

        new Ugly().delete(page);
    }

    interface ReturnCodes {

        int E_OK = 0;

        int E_ERROR = 1;

    }

    private static class Ugly {

        final Registry registry = new Registry();

        final ConfigKeys configKeys = new ConfigKeys();

        int delete(Page page) {
            int returnCode;
            if ((returnCode = deletePage(page)) == E_OK) {
                if ((returnCode = registry.deleteReference(page.name)) == E_OK) {
                    if (configKeys.deleteKey(Page.makeKey(page)) == E_OK) {
                        System.out.println("page deleted");
                    } else {
                        System.out.println("configKey not deleted");
                    }
                } else {
                    System.out.println("deleteReference from registry failed");
                }
            } else {
                System.out.println("delete failed");
            }

            // What about atomicity?

            return returnCode;
        }

        int deletePage(Page page) {
            // Some code here

            return E_OK;
        }

    }

    static class ConfigKeys {

        int deleteKey(Key key) {

            return E_OK;
        }

    }

    static class Registry {

        int deleteReference(String name) {

            return E_OK;
        }

    }

}
