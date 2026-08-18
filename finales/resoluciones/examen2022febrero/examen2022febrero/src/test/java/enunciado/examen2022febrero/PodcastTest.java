package enunciado.examen2022febrero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PodcastTest {
	
	Podcast podcast;
	Episodio episodio1; //gratuito
	EpisodioPremium episodio2; //premium
	Episodio episodio3; //bonus
	
	@Test
	void test() {
		this.podcast = new Podcast("Historias de terror");
		this.episodio1 = new Episodio(15,300);
		this.episodio2 = new EpisodioPremium(19,500,20);
		this.episodio3 = new Episodio(20,200);
		this.episodio2.agregarBonus(episodio3);
		this.podcast.agregarEpisodio(episodio1);
		this.podcast.agregarEpisodio(episodio2);
		assertEquals(this.podcast.cantTotalEscuchas(),1000);
		System.out.println(this.podcast.duracionPromedio());
		assertEquals(this.podcast.duracionPromedio(),17.25);
	}

}
