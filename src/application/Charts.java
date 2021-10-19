package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Charts extends Application {
	@Override
	public void start(Stage primaryStage) {
			FlowPane tela = new FlowPane();
			Scene scene = new Scene(tela,600,400);
			//criando grafico
			CategoryAxis eixoX = new CategoryAxis();
			NumberAxis eixoY = new NumberAxis();
			BarChart<String, Number> grafico = new BarChart<String, Number>(eixoX, eixoY);
			tela.getChildren().add(grafico);
			// criando a series para o grafico
			XYChart.Series<String, Number> maria = new XYChart.Series<>();
			maria.setName("Maria");
			XYChart.Series<String, Number> joao = new XYChart.Series<>();
			joao.setName("João");
			XYChart.Series<String, Number> pedro = new XYChart.Series<>();
			pedro.setName("Pedro");
			//adiciona dados as series
			maria.getData().add(new XYChart.Data<String, Number>("Janeiro",2500));
			joao.getData().add(new XYChart.Data<String, Number>("Janeiro",2000));
			pedro.getData().add(new XYChart.Data<String, Number>("Janeiro",1000));
			
			maria.getData().add(new XYChart.Data<String, Number>("Fevereiro",500));
			joao.getData().add(new XYChart.Data<String, Number>("Fevereiro",5000));
			pedro.getData().add(new XYChart.Data<String, Number>("Fevereiro",2000));
			
			maria.getData().add(new XYChart.Data<String, Number>("Março",1500));
			joao.getData().add(new XYChart.Data<String, Number>("Março",3000));
			pedro.getData().add(new XYChart.Data<String, Number>("Março",6000));
			//adiciona as series ao grafico
			grafico.getData().addAll(maria,joao,pedro);
			
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
