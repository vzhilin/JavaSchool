package ru.sberbank.school.exceptions.returncode;

public class NiceExample2 {

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


        void delete(Page page) {
            try {
                deletePageAndAllReferences(page);
            } catch (Exception e) {
                logError(e);
            }
        }

        void deletePageAndAllReferences(Page page) throws Exception {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(Page.makeKey(page));
        }

        void logError(Exception e) {
            System.out.println(e.getMessage());
        }

        void deletePage(Page page) {
            if (false) {
                throw new RuntimeException();
            }
        }

    }

    static class ConfigKeys {

        void deleteKey(Key key) {
            if (false) {
                throw new RuntimeException();
            }
        }

    }

    static class Registry {

        void deleteReference(String name) {
            if (false) {
                throw new RuntimeException();
            }
        }

    }

}
