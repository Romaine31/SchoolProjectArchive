using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Spawner : MonoBehaviour //mob spawner
{

	public GameObject Enemy; //these show up in unity editor but you can't edit them there
	public int xPos;
	public int zPos;
	public int enemyCount;
	
	void Start(){
		StartCoroutine(EnemySpawn()); //idk you need this, im not really sure why
	}
	
	IEnumerator EnemySpawn() 
	{
		while (enemyCount < 50)
		{
			xPos = Random.Range(156, 170); //takes global coordinates, starts from 0,0. disregarding the coordinates of the object you assigned it to
			zPos = Random.Range(80, 90); // xpos and zpos are where to spawn the enemy object
			Instantiate(Enemy, new Vector3(xPos, 1, zPos), Quaternion.identity);
			yield return new WaitForSeconds(0.5f); //delay in between spawns
			enemyCount += 1; //spawns enemies
		}
	}
}
// delete niyo ung comments na walang kwenta -romaine
