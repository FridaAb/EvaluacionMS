package test.entityserviceclientesv1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.entityserviceclientesv1.entity.Cliente;
import test.entityserviceclientesv1.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	ClienteService service;

	@GetMapping("ver-todos")
	public List<Cliente> listarClientes() {
		return service.listarClientes();
	}

	@GetMapping("buscar-por-id/{id}")
	public Cliente buscar(@PathVariable int id) {
		return service.buscarCliente(id);
	}

	@PostMapping("añadir")
	public Cliente guardar(@RequestBody Cliente cliente) {
		return service.añadirCliente(cliente);
	}

	@PutMapping("actualizar")
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return service.actualizarCliente(cliente);
	}

	@DeleteMapping("borrar/{id}")
	public String delete(@PathVariable int id) {
		return service.eliminarCliente(id);
	}

}
