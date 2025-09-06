package exception_handling;

public class try_catch_finally_block_posibility {

    public static void main(String[] args) {

                try {
                    try {

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }finally {
                    try {

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }
                try {

                }
                catch (Exception e){
                    try {

                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }

                }


        }
    }

