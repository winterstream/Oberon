class NPOberonObjectProxy extends Object { 
	private int proxyID;

	native public boolean GetBool(String name);
	native public int GetInt(String name);
	native public float GetReal(String name);
	native public double GetLongReal(String name);
	native public String GetString(String name);

	native public void SetBool(String name, boolean b);
	native public void SetInt(String name, int i);
	native public void SetReal(String name, float x);
	native public void SetLongReal(String name, double y);
	native public void SetString(String name, String s);

	native public NPOberonObjectProxy GetLink(String name);
	native public void SetLink(String name, NPOberonObjectProxy obj);
	native public NPOberonObjectProxy FindObj(String name);

	native public void Update();
	native public void Execute(String cmd);

	native public void Finalize();

	public void SetProxyID(int proxyID) {
		this.proxyID = proxyID;
	}

	public int GetProxyID() {
		return proxyID;
	}

	public void NPOberonObjectProxy() {
		proxyID = 0;
	}

	protected void finalize() throws Throwable {
		Finalize();
		proxyID = 0;
		super.finalize();
	}

}
