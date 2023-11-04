package interfacess;

public interface Building {
	
	BuildingBase basement();
	SealingTop sealing();
	/**
	  this is walls method, this need to done the walls constructions
	*/
	void walls();
	void painting();

}
