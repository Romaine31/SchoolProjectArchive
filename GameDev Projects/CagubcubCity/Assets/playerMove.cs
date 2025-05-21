using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class playerMove : MonoBehaviour
{
    public CharacterController controller;
    public float speed = 12f;
    public float sprint = 24f;
    public float crouch = 8f;
	private float gravity = 7.81f;
	private float jump = 1.5f;
	private float moveY;
	private Vector3 normalHeight = new Vector3(0,0f,0);
	
	[SerializeField] private KeyCode sprintKey = KeyCode.LeftShift;
	[SerializeField] private KeyCode crouchKey = KeyCode.LeftControl;
	
	private bool canSprint = true;
	public bool isSprinting => canSprint && !isCrouching && Input.GetKey(sprintKey);
	private bool isCrouching => Input.GetKey(crouchKey) && controller.isGrounded;

    void Start()
    {
        controller = GetComponent<CharacterController>();
    }

    void Update()
    {
        float x = Input.GetAxis("Horizontal") * (isSprinting ? sprint : isCrouching ? crouch : speed);
        float z = Input.GetAxis("Vertical") * (isSprinting ? sprint : isCrouching ? crouch : speed);
		controller.center = normalHeight;

        Vector3 move = transform.right * x + transform.forward * z;
		
		if (controller.isGrounded)
		{
		if(Input.GetButtonDown("Jump") && !isCrouching){
			moveY = speed * jump;
		}
		}
		if (isCrouching){
		controller.center = new Vector3(0,1f,0);
		}
		
		moveY -= gravity * speed * Time.deltaTime;
		
		move.y = moveY-3;
		
        controller.Move(move * Time.deltaTime);
    }
}
