package application;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {
	private List<Book> bookList = new ArrayList<>();
	
	
	public ObservableList<Book> getBookList() {
		Book newBook = new Book("Harry Potter", "01", "Xyz", "Abc");
        bookList.add(newBook);
	    return FXCollections.observableArrayList(bookList);
	}	

    @FXML
    private TextField bookTitleField;

    @FXML
    private TextField bookIdField;

    @FXML
    private TextField bookAuthorField;

    @FXML
    private TextField publisherField;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;
    
    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem newMenuItem;

    @FXML
    private MenuItem openMenuItem;

    @FXML
    private MenuItem saveMenuItem;

    @FXML
    private MenuItem saveAsMenuItem;

    @FXML
    private MenuItem exitMenuItem;

    @FXML
    private Menu editMenu;

    @FXML
    private MenuItem addBookMenuItem;

    @FXML
    private MenuItem editBookMenuItem;

    @FXML
    private MenuItem deleteBookMenuItem;

    @FXML
    private Menu viewMenu;

    @FXML
    private MenuItem viewAllBooksMenuItem;

    @FXML
    private MenuItem searchBooksMenuItem;



    @FXML
    private ProgressBar progressBar;

    @FXML
    private ImageView leftLogo;

    @FXML
    private ImageView rightLogo;
    
    
    @FXML
    private TableView<Book> bookTableView;

    @FXML
    private TableColumn<Book, String> titleColumn;

    @FXML
    private TableColumn<Book, String> authorColumn;

    @FXML
    private TableColumn<Book, String> isbnColumn;

    @FXML
    private TableColumn<Book, String> availabilityColumn;


    
    
    
    
    
    // Method to handle exitMenuItem action
    @FXML
    private void handleExit() {
        System.exit(0); // You can replace this with your own exit logic
    }

    // Method to handle addBookMenuItem action
    @FXML
    private void handleAddBook() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("interface.fxml"));
            Parent root = loader.load();
            Controller addBookController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Add Book");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Display an error message if loading fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to open Add Book window");
            alert.setContentText("An error occurred while opening the Add Book window.");
            alert.showAndWait();
        }
    }
    
    
    @FXML
    private void handleDeleteBook() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("delete.fxml"));
            Parent root = loader.load();
            Controller addBookController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Delete Book");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Display an error message if loading fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to open Delete Book window");
            alert.setContentText("An error occurred while opening the Delete Book window.");
            alert.showAndWait();
        }
    }
    
    
    
    @FXML
    private void handleEditBook() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("edit.fxml"));
            Parent root = loader.load();
            Controller addBookController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Edit Book");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Display an error message if loading fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to open Edit Book window");
            alert.setContentText("An error occurred while opening the Edit Book window.");
            alert.showAndWait();
        }
    }
    
    
    
   
    // Method to handle viewAllBooksMenuItem action
    @FXML
    private void handleViewAllBooks() {
        System.out.println("View All Books menu item clicked.");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("List.fxml"));
            Parent root = loader.load();
            Controller viewBookController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("List of Books");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Display an error message if loading fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to open List Book window");
            alert.setContentText("An error occurred while opening the List Book window.");
            alert.showAndWait();
        }
    }
    


    // Method to handle searchBooksMenuItem action
    @FXML
    private void handleSearchBooks() {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("search.fxml"));
            Parent root = loader.load();
            Controller addBookController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Search Book");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Display an error message if loading fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to open Search Book window");
            alert.setContentText("An error occurred while opening the Search Book window.");
            alert.showAndWait();
        }
    }

   

    @FXML
    // Method to handle newMenuItem action
    private void handleNew() {
        System.out.println("New menu item clicked.");
    }

    @FXML
    // Method to handle openMenuItem action
    private void handleOpen() {
        System.out.println("Open menu item clicked.");
    }

    @FXML
    // Method to handle saveMenuItem action
    private void handleSave1() {
        System.out.println("Save menu item clicked.");
    }

    @FXML
    // Method to handle saveAsMenuItem action
    private void handleSaveAs() {
        System.out.println("Save As menu item clicked.");
    }

    // Method to handle the saveButton action
    @FXML
    private void handleSave() {
        String title = bookTitleField.getText();
        String id = bookIdField.getText();
        String author = bookAuthorField.getText();
        String publisher = publisherField.getText();

        Book newBook = new Book(title, id, author, publisher);
        bookList.add(newBook);
        
        // You can perform actions with the input data, such as saving it to a database
        System.out.println("Saving book:");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        

        // Refreshing TableView to reflect the changes
        //bookTableView.refresh();
    }

    
   

    // Method to handle the cancelButton action
    @FXML
    private void handleCancel() {
        // Clearing the text fields
        bookTitleField.clear();
        bookIdField.clear();
        bookAuthorField.clear();
        publisherField.clear();

        // Close the window
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();

        System.out.println("Cancel button clicked. Fields cleared and window closed.");
    }
    
    
    @FXML
    private void handle_Cancel() {
        // Clearing the text fields
        bookTitleField.clear();
        bookIdField.clear();
        bookAuthorField.clear();
        

        // Close the window
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();

        System.out.println("Cancel button clicked. Fields cleared and window closed.");
    }
    
    
    /*public static class Book {
  	  private final StringProperty title;
  	    private final StringProperty id;
  	    private final StringProperty author;
  	    private final StringProperty publisher;


      public Book(String title, String id, String author, String publisher) {
      	 this.title = new SimpleStringProperty(title);
           this.id = new SimpleStringProperty(id);
           this.author = new SimpleStringProperty(author);
           this.publisher = new SimpleStringProperty(publisher);
       }

       // Getter methods for the properties
       public StringProperty titleProperty() {
           return title;
       }

       public StringProperty isbnProperty() {
           return id;
       }

       public StringProperty authorProperty() {
           return author;
       }

       public StringProperty availabilityProperty() {
           return publisher;
       }

     
      @Override
      public String toString() {
          return "Book{" +
                  "title='" + title + '\'' +
                  ", id='" + id + '\'' +
                  ", author='" + author + '\'' +
                  ", publisher='" + publisher + '\'' +
                  '}';
      }
  }
    
    
    @FXML
    private void initialize() {
        titleColumn.setCellValueFactory(data -> data.getValue().titleProperty());
        authorColumn.setCellValueFactory(data -> data.getValue().authorProperty());
        isbnColumn.setCellValueFactory(data -> data.getValue().isbnProperty());
        availabilityColumn.setCellValueFactory(data -> data.getValue().availabilityProperty());
        
        // Bind the TableView items to the bookList
        bookTableView.setItems((ObservableList<Book>) bookList);
    }*/
    
    
    public static class Book {
        private String title;
        private String id;
        private String author;
        private String publisher;

        public Book(String title, String id, String author, String publisher) {
            this.title = title;
            this.id = id;
            this.author = author;
            this.publisher = publisher;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", id='" + id + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    '}';
        }
    }
    

}
