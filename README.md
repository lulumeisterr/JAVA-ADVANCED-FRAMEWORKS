# JAVA-ADVANCED-FRAMEWORKS

  Padão de projeto : Programas ou soluções desenvolvida por outros
  desenvolvedores que facilita minimizar pequenos problemas e facilita na reutilização de informação para
  que outros desenvolvedores possa utilizar e seguir oque foi feito. Ou Seja para todo
  desenvolvedor que vai atuar em um sistema e tem a capacidade de identificar o padrao de projeto utilizado
  fica mais visivel atuar no desenvolvimento ou solucao do problema. Ou seja é como vc resolve um problema;

  Framework : Ele te apresenta uma base de codigo para que você consiga desenvolver o seu respectivo cenario ou
  seja ele monta a estrutura para que vc possa codar, é justamente fazer o desenvolvimento com escabilidade e ter
  um resultado com excelencia.

  Desing Patterns : Você utiliza um padrao em que muitas pessoas ja desenvolveram e ja conhecem os problemas
  que já te economiza o seu tempo de desenvolvimento e melhora sua performace e aumenta a chance de
  dar certo seu desenvolvimento.

	
# Padroes de Prjeto :
	
	http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/arqu/mvc/mvc.htm
	MVC(Decada de 1970) - Aplições separadas de 3 camadas
		- View - Front end
		- Model -  Lógica de negócio
		- Controller - Transforma eventos gerados pela interface em ações de negócio, alterando o modelo.

		Cliente -> View (Entrada de informação ) ->  
			   Controller (Recebe resultados e os repassa para a view apropriada) -> 
			   Model -> Lança eventos , indicando a mudança


# Factory : 

  Delega responsabilidade para quem vai utilizar sendo assim é possivel disparar a informação certa:
		
    Ex : Imagine que você tenha um sistema distribuido para varios clientes e necessita identificar 
			para quem você delegará as informações corretamente de acordo com as resquições feitas. 
      
    ( Ai que entra a Factory ela sera responsavel por identificar qual sistema esta sendo chamado e delegar essa informação para quem       for utilizar ela )

	
# Builder : 

Para ser utilizado em objetos complexos , ou seja objetos que adentro dele temos outros objetos e necessitamos realizar mudanças sendo assim podemos facilitar o processo de criação de objetos.

# Singleton : 
  Define-se em criar uma unica instancia para que seja disponibilizada em todo o projeto.
  
  - Consumindo um arquivo .properties anexado no projeto acionando uma unica instancia.
  
        private static Properties prop;
	      private ConfigSingleton () {}
	
		public static Properties getInstance() {
				
		if(prop == null) {
			prop = new Properties();
			try {
				prop.load(ConfigSingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;
	     }
	     
  - Consumindo o Singleton
  
        private float aliquota;
        private float valorPis;
	
        public Pis() {
        aliquota = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquota"));}
	
# Adapter : 
  Permite o Cliente utilizar, além de outros objetos ou metodos ja existentes, os objetos do tipo Adaptado. 
		  Objetos do tipo Adaptador têm objetos da classe Adaptado sendo integrados por meio de composição.
	          https://www.thiengo.com.br/padrao-de-projeto-adapter
            
# Faced : 
  é Reponsavel por fornecer uma interface ou um canal de auto nivel que delega uma sequencia de passos a ser executados automaticamente   ou seja é uma interface de interação com outros componentes.

# Observer : 
  Ação notificatoria que nos permite observar comportamentos que acontecem no sistema e repassar para todas as ações que estao esperando  a resposta de algo.
  	
	public class Pis extends Observable  implements Imposto {
	
  	/**
	 * Utilizando setChanged() para por este metodo em modo de observação e utilizando
	 * o recurso notify para exibir o valor alterado
	 */
	 
	@Override
	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(valorPis);
	}
     }
	

	




