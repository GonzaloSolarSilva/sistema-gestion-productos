package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ProductoServiceTest {

	@Mock
	private ProductoRepository productoRepository;

	@InjectMocks
	private ProductoService productoService;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void deberiaCrearProductoCorrectamente() {
		Producto producto = new Producto();
		producto.setNombre("Laptop");
		producto.setPrecio(1500.0);
		producto.setStock(10);

		when(productoRepository.save(producto)).thenReturn(producto);

		Producto resultado = productoService.crear(producto);

		assertNotNull(resultado);
		assertEquals("Laptop", resultado.getNombre());
		verify(productoRepository, times(1)).save(producto);
	}

	@Test
	void deberiaRetornarNullSiProductoNoExiste() {
		when(productoRepository.findById(99L)).thenReturn(Optional.empty());

		Producto resultado = productoService.obtenerPorId(99L);

		assertNull(resultado);
	}
}