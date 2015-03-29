package net.genesishub.Exposures3.PluginManager;

public enum State {
	ENABLE, DISABLE, UNKNOWN;
	public State getState(){
		if(super.equals(State.ENABLE)){
			return State.ENABLE;
		}
		else if(super.equals(State.DISABLE)){
			return State.DISABLE;
		}
		else{
			return State.UNKNOWN;
		}
	}
}
