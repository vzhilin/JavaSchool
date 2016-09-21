package ru.sberbank.school.exceptions.returncode;

public class NiceExample1 {

    public static void main(String[] args) {
        Page page = new Page();

        new Nice().delete(page);
    }

    interface ErrorCodes {

        int E_OK = 0;

        int E_ERROR = 1;

    }

    private static class Nice {

        final Registry registry = new Registry();

        final ConfigKeys configKeys = new ConfigKeys();


        void delete(Page page){
            try {
                deletePage(page);
                registry.deleteReference(page.name);
                configKeys.deleteKey(Page.makeKey(page));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        void deletePage(Page page) throws Exception {
            if (false) {
                throw new Exception();
            }
        }

    }

    static class ConfigKeys {

        void deleteKey(Key key) throws Exception {
            if (false) {
                throw new Exception();
            }
        }

    }

    static class Registry {

        void deleteReference(String name) throws Exception {
            if (false) {
                throw new Exception();
            }
        }

    }

}
