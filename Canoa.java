
  class Canoa extends VeiculoAquatico{
	@Override
	public void definirRumo(int n) {
		System.out.println("Canoa virando para o rumo: " + n + " graus.");
	}
	@Override
	public void definirVelocidade(int n) {
		System.out.println("Canoa ajustando velocidade para: " + n + " nós.");
	}
}
