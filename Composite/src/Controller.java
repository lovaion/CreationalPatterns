import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {

    public HBox boxPrincipale;
    public ImageView cartella;
    public ImageView file;
    public FlowPane griglia;
    public String path = String.valueOf(getClass().getResource("resources/resizedFolder.png"));
    public String pathFileResized = String.valueOf(getClass().getResource("resources/resizedFile.png"));
    private List<FileSystemTest> cartelle;
    private ArrayList<String> nomiCartelle = new ArrayList<>();


    public void initialize() {
        cartelle = new ArrayList<>();
        cartella.setImage(new Image(String.valueOf(getClass().getResource("resources/folder.png"))));
        file.setImage(new Image(String.valueOf(getClass().getResource("resources/file.png"))));
    }

    public void creaCartella(MouseEvent mouseEvent) {
        if (nomiCartelle.isEmpty()) {
            TextInputDialog dialog = new TextInputDialog("");
            dialog.setTitle("Nome cartella");
            dialog.setContentText("Inserisci il nome della cartella");
            Optional<String> result = dialog.showAndWait();
            FolderTest test = new FolderTest(result.get());
            cartelle.add(test);
            nomiCartelle.add(result.get());
            griglia.getChildren().add(new ImmagineDaUsare(test));
        } else {
            boolean finito = false;
            FolderTest test = null;
            Optional<String> choice = null;
            while (finito == false) {
                TextInputDialog dialog = new TextInputDialog("");
                dialog.setTitle("Nome cartella");
                dialog.setContentText("Inserisci il nome della cartella");
                Optional<String> result = dialog.showAndWait();
                test = new FolderTest(result.get());
                cartelle.add(test);
                ChoiceDialog<String> dialog2 = new ChoiceDialog<>(nomiCartelle.get(0), nomiCartelle);
                dialog2.setHeaderText("Posizione");
                dialog2.setTitle("Posizione cartella");
                dialog2.setContentText("Scegli la posizione della cartella:");
                choice = dialog2.showAndWait();
                boolean trovato = false;
                for (String s : nomiCartelle) {
                    if (s.equals(result.get()))
                        trovato = true;
                }
                if (!trovato) {
                    nomiCartelle.add(result.get());
                    finito = true;
                }
                else
                    System.out.println("Impossibile aggiungere. Nome già esistente.");
                }

            for (FileSystemTest fileSystemTest : cartelle) {
                if (fileSystemTest.getName().equals(choice.get())) {
                    fileSystemTest.add(test);
                    griglia.getChildren().add(new ImmagineDaUsare(test));
                    break;
                }
            }
        }
    }

    public void creaFile(MouseEvent mouseEvent) {
        if (nomiCartelle.isEmpty()) {
            TextInputDialog dialog = new TextInputDialog("");
            dialog.setTitle("Nome file");
            dialog.setContentText("Inserisci il nome del file");
            Optional<String> result = dialog.showAndWait();
            FileTest test = new FileTest(result.get());
            cartelle.add(test);
            griglia.getChildren().add(new ImmagineDaUsare(test));


        } else {

            TextInputDialog dialog = new TextInputDialog("");
            dialog.setTitle("Nome file");
            dialog.setContentText("Inserisci il nome del file");
            Optional<String> result = dialog.showAndWait();
            FileTest test = new FileTest(result.get());
            cartelle.add(test);
            ChoiceDialog<String> dialog2 = new ChoiceDialog<>(nomiCartelle.get(0), nomiCartelle);
            dialog2.setHeaderText("Posizione");
            dialog2.setTitle("Posizione cartella");
            dialog2.setContentText("Scegli la posizione della cartella:");
            Optional<String> choice = dialog2.showAndWait();


            for (FileSystemTest fileSystemTest : cartelle) {
                if (fileSystemTest.getName().equals(choice.get())) {
                    fileSystemTest.add(test);
                    griglia.getChildren().add(new ImmagineDaUsare(test));
                    break;
                }
            }
        }
    }

    private class ImmagineDaUsare extends ImageView {
        FileSystemTest soggetto;

        public ImmagineDaUsare(FileSystemTest test) {
            super();
            soggetto = test;
            if (test instanceof FolderTest) {
                this.setImage(new Image(path));
                this.setOnMouseClicked(event -> soggetto.print());
            } else {
                this.setImage(new Image(pathFileResized));
                this.setOnMouseClicked(event -> soggetto.print());
            }
        }

    }
}
