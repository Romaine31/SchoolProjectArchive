using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class playerMovement : MonoBehaviour
{

    public CharacterController controller;
    public float speed = 12f;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        //get horizontal and vertical input
        float x = Input.GetAxis("Horizontal");
        float z = Input.GetAxis("Vertical");

        //movement calculation
        Vector3 move = transform.right * x + transform.forward * z;

        //movement
        controller.Move(move * speed * Time.deltaTime);
    }
}
