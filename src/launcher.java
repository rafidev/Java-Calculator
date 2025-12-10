import javax.swing.SwingUtilities;

public class launcher {
        public static void main(String[] args) throws Exception {

            SwingUtilities.invokeLater(new Runnable() {

                @Override

                public void run(){

                    main main = new main();

                    main.Main();

                }
            });

        }
}
