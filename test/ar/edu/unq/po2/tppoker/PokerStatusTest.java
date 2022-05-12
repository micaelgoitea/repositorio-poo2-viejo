package ar.edu.unq.po2.tppoker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus pokerstatus = new PokerStatus();

	@Test
	public void soloDosCartasTienenElMismoValorEsNoHayPoker() {
		assertFalse(pokerstatus.verificar("KP", "KP", "KD", "KD", "10D"));
	}
	
	@Test
	public void soloTresCartasTienenElMismoValorNoHayPoker() {
		assertFalse(pokerstatus.verificar("KD", "KD", "KD", "10D", "7C"));
	}
	
	@Test
	public void soloCuatroCartasTienenElMismoValorHayPoker() {
		assertTrue(pokerstatus.verificar("KP", "KC", "KD", "KT", "10D"));
	}
	
	@Test
	public void soloCuatroCartasTienenElMismoValorEnDistintoOrdenHayPoker() {
		assertTrue(pokerstatus.verificar("KP", "KC", "10D", "KT", "KD"));
	}
	
	@Test
	public void cincoCartasTienenElMismoValorHayPoker() {
		assertTrue(pokerstatus.verificar("KP", "KC", "KT", "KD", "KC"));
	}
	
	@Test
	public void cincoCartasTienenDiferenteValorNoHayPoker() {
		assertFalse(pokerstatus.verificar("KP", "10D", "7C", "8", "4T"));
	}
}