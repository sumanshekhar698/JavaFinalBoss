package dev.codecounty.exceptions;

public class ExceptionHandlingWithThrows {


    public static void main() {


        ExceptionHandlingWithThrows ep = new ExceptionHandlingWithThrows();


        try {
            ep.callA();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        catch (Throwable t) { // We should not include a catch with Throwable as it catches Errors as well
//            t.printStackTrace();
//        }

        System.out.println("END");
    }


    private void callA() throws InterruptedException {
        System.out.println("callA");
        callB();
    }

    private void callB() throws InterruptedException {
        System.out.println("callB");
        callC();
    }

    private void callC() throws InterruptedException {
        System.out.println("callC");

        Thread.sleep(500);
        System.out.println("END");

    }

}


