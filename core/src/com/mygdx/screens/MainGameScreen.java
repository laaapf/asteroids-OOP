package com.mygdx.screens;

//import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.objects.Player;

import com.mygdx.asteroids.AsteroidsGame;

public class MainGameScreen implements Screen {

  // Declarei uma instância da classe principal
  AsteroidsGame game;

  SpriteBatch batch = new SpriteBatch();
  
  /* Criei uma instância da classe World, esta é necessária para o uso de Box2D
  * Param:
  * Vector2(a, b):
  * 	a = gravidade no eixo x
  * 	b = gravidade no eixo y
  * Boolean:
  * indica se o programador quer que objetos "durmam", isto reduz uso da cpu
  */
  World world = new World(new Vector2(0, 0), true);

  // Criando imagens
  Texture img = new Texture("imgs/SpaceShip24x24.png");
  
  Sprite sprite = new Sprite(img);
  
  // Instânciando player
  Player player = new Player(50, 50, world, sprite);

  // Tamanho da janela
  int WINDOWS_WIDTH = Gdx.graphics.getWidth();
  int WINDOWS_HEIGH = Gdx.graphics.getHeight();
  
  // CONSTRUTOR DA CLASSE
  public MainGameScreen(AsteroidsGame game) {

    this.game = game;

  }

  @Override
  public void show() {



  }

  @Override
  public void render(float delta) {

    Gdx.gl.glClearColor(0, 0, 0, 0);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    player.move();
    
    batch.begin();
    //game.batch.begin();
    //game.batch.draw(sprite, player.pos.x, player.pos.y);
    sprite.draw(batch);
    batch.end();
    //game.batch.end();

  }

  @Override
  public void resize(int width, int height) {

	  
	
  }

  @Override
  public void pause() {

  }

  @Override
  public void resume() {

  }

  @Override
  public void hide() {

  }

  @Override
  public void dispose() {

    // game.batch.dispose();
    // img.dispose();

  }

}