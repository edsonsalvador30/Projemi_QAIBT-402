package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ProcessoServ {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Processo
	public static Var Autenticado() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Edson Autenticado").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(15), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void CriouSessao() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Sessao Foi criada").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void MudouPagina() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Mudou de Pagina").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(18), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void PagLoginCarregada() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Pagina de Login Carregada").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(40), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void PagPrincipalCarregada() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Pagina Principal Carregada").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(32), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void SaiuSistema() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Saiu do Sistema").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(20), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void SessaoDestruida() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						System.out.println(Var.valueOf("Sessao Foi destruida").getObjectAsString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(30), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
