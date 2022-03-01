package test.entityserviceclientesv1.service;

import java.util.List;

import test.entityserviceclientesv1.entity.Cliente;

public interface ClienteService {

	List<Cliente> listarClientes();
	Cliente añadirCliente(Cliente c);
	Cliente actualizarCliente(Cliente c);
	Cliente buscarCliente(int id);
	String eliminarCliente(int id);
}
