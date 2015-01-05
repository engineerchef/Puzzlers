/*
 * @(#)Example.java 1.0
 *
 */


import lsdis.workflow.SWR.*;


/**
 * An example of how to construct a workflow and use the SWR algorithm.
 *
 * @version 1.0
 * @author Jorge Cardoso, University of Georgia, jcardoso@arches.uga.edu
 */

public class xor {

	/**
	* Constructor.
	*/
	public xor() {
	}

	public static void main(String[] args) {

		xor t = new xor();

		Workflow wf = t.buildComplexWorkflow();

		SWR.debug = SWR.OFF;
		SWR swr = new SWR(wf);

		Task remaining_tk = swr.reduce();
		if(remaining_tk == null)
			System.out.println("[xor].reduce: Error in reduction. Algorithm ended and " +
								"workflow size is != 1 ");
		else
			System.out.println(remaining_tk.getDescription());
	}

	/**
	* Build a workflow.
	*/
	public Workflow buildComplexWorkflow(){

		Workflow workflow_w = new Workflow("W", "NETWORK", Task.XOR, Task.XOR);

		TaskQoS qos_s = new TaskQoS(new QoSDimension(0,0,0),
									new QoSDimension(0,0,0),
									new QoSDimension(1,1,1),
									null);
		Task s		= new Task(Task.START, "Human", Task.XOR, Task.XOR, qos_s);

		TaskQoS qos_t1 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t1		= new Task("T1", "Human", Task.XOR, Task.XOR, qos_t1);

		TaskQoS qos_t2 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t2		= new Task("T2", "Human", Task.XOR, Task.AND, qos_t2);

		TaskQoS qos_t3 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t3		= new Task("T3", "Human", Task.XOR, Task.XOR, qos_t3);

		TaskQoS qos_t4 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t4		= new Task("T4", "Human", Task.XOR, Task.XOR, qos_t4);

		TaskQoS qos_t5 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t5		= new Task("T5", "Human", Task.XOR, Task.XOR, qos_t5);

		TaskQoS qos_t6 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t6		= new Task("T6", "Human", Task.AND, Task.XOR, qos_t6);

		TaskQoS qos_t7 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t7		= new Task("T7", "Human", Task.XOR, Task.XOR, qos_t7);

		TaskQoS qos_t8 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t8		= new Task("T8", "Human", Task.XOR, Task.XOR, qos_t8);

		TaskQoS qos_t9 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t9		= new Task("T9", "Human", Task.XOR, Task.XOR, qos_t9);

		TaskQoS qos_t10 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task t10		= new Task("T10", "Human", Task.XOR, Task.XOR, qos_t10);

		Workflow network_nt	= new Workflow("NT", "NETWORK", Task.XOR, Task.XOR);

		TaskQoS qos_e = new TaskQoS(new QoSDimension(0,0,0),
									new QoSDimension(0,0,0),
									new QoSDimension(1,1,1),
									null);
		Task e		= new Task(Task.END, "Human", Task.XOR, Task.XOR, qos_e);

		Transition trs_1 = new Transition(s, t1, 1.0);

		Transition tr1_2 = new Transition(t1, t2, 1/3.0);
		Transition tr2_3 = new Transition(t2, t3, 1.0);
		Transition tr2_4 = new Transition(t2, t4, 1.0);
		Transition tr2_5 = new Transition(t2, t5, 1.0);
		Transition tr3_6 = new Transition(t3, t6, 1.0);
		Transition tr4_6 = new Transition(t4, t6, 1.0);
		Transition tr5_6 = new Transition(t5, t6, 1.0);
		Transition tr6_10 = new Transition(t6, t10, 1.0);

		Transition tr1_7 = new Transition(t1, t7, 1/3.0);
		Transition tr7_8 = new Transition(t7, t8, 1.0);
		Transition tr8_10 = new Transition(t8, t10, 1.0);

		Transition tr1_9 = new Transition(t1, t9, 1/3.0);
		Transition tr9_10 = new Transition(t9, t10, 1.0);

		Transition tr10_n = new Transition(t10, network_nt, 1.0);
		Transition trn_e = new Transition(network_nt, e, 1.0);

		workflow_w.addTask(s);
		workflow_w.addTask(t1);
		workflow_w.addTask(t2);
		workflow_w.addTask(t3);
		workflow_w.addTask(t4);
		workflow_w.addTask(t5);
		workflow_w.addTask(t6);
		workflow_w.addTask(t7);
		workflow_w.addTask(t8);
		workflow_w.addTask(t9);
		workflow_w.addTask(t10);
		workflow_w.addTask(network_nt);
		workflow_w.addTask(e);

		workflow_w.addTransition(trs_1);
		workflow_w.addTransition(tr1_2);
		workflow_w.addTransition(tr2_3);
		workflow_w.addTransition(tr2_4);
		workflow_w.addTransition(tr2_5);
		workflow_w.addTransition(tr3_6);
		workflow_w.addTransition(tr4_6);
		workflow_w.addTransition(tr5_6);
		workflow_w.addTransition(tr6_10);
		workflow_w.addTransition(tr1_7);
		workflow_w.addTransition(tr7_8);
		workflow_w.addTransition(tr8_10);
		workflow_w.addTransition(tr1_9);
		workflow_w.addTransition(tr9_10);
		workflow_w.addTransition(tr10_n);
		workflow_w.addTransition(trn_e);

		TaskQoS qos_ns = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task ns		= new Task(Task.START, "Human", Task.XOR, Task.XOR, qos_ns);

		TaskQoS qos_nt1 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt1		= new Task("NT1", "Human", Task.XOR, Task.AND, qos_nt1);

		TaskQoS qos_nt2 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt2		= new Task("NT2", "Human", Task.XOR, Task.XOR, qos_nt2);

		TaskQoS qos_nt3 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt3		= new Task("NT3", "Human", Task.XOR, Task.XOR, qos_nt3);

		TaskQoS qos_nt4 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt4		= new Task("NT4", "Human", Task.XOR, Task.XOR, qos_nt4);

		TaskQoS qos_nt5 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt5		= new Task("NT5", "Human", Task.XOR, Task.XOR, qos_nt5);

		TaskQoS qos_nt6 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt6		= new Task("NT6", "Human", Task.XOR, Task.XOR, qos_nt6);

		TaskQoS qos_nt7 = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task nt7		= new Task("NT7", "Human", Task.AND, Task.XOR, qos_nt7);

		TaskQoS qos_ne = new TaskQoS(	new QoSDimension(0,0,0),
										new QoSDimension(0,0,0),
										new QoSDimension(1,1,1),
										null);
		Task ne		= new Task(Task.END, "Human", Task.XOR, Task.XOR, qos_ne);

		Transition ntrs_1 = new Transition(ns, nt1, 1);

		Transition ntr1_2 = new Transition(nt1, nt2, 1);
		Transition ntr2_7 = new Transition(nt2, nt7, 1);

		Transition ntr1_3 = new Transition(nt1, nt3, 1);

		Transition ntr3_4 = new Transition(nt3, nt4, 1/2.0);
		Transition ntr4_6 = new Transition(nt4, nt6, 1);
		Transition ntr3_5 = new Transition(nt3, nt5, 1/2.0);
		Transition ntr5_6 = new Transition(nt5, nt6, 1);
		Transition ntr6_7 = new Transition(nt6, nt7, 1);

		Transition ntr7_e = new Transition(nt7, ne, 1);

		network_nt.addTask(ns);
		network_nt.addTask(nt1);
		network_nt.addTask(nt2);
		network_nt.addTask(nt3);
		network_nt.addTask(nt4);
		network_nt.addTask(nt5);
		network_nt.addTask(nt6);
		network_nt.addTask(nt7);
		network_nt.addTask(ne);

		network_nt.addTransition(ntrs_1);
		network_nt.addTransition(ntr1_2);
		network_nt.addTransition(ntr2_7);
		network_nt.addTransition(ntr1_3);
		network_nt.addTransition(ntr3_4);
		network_nt.addTransition(ntr4_6);
		network_nt.addTransition(ntr3_5);
		network_nt.addTransition(ntr5_6);
		network_nt.addTransition(ntr6_7);
		network_nt.addTransition(ntr7_e);

		return workflow_w;
	}
}


