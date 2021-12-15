package org.icar.bpmn2goal

import java.io.FileInputStream

object goal_extractor extends App {

  //val file = "data/process/email_voting_example.bpmn" //procurement_example
  //val file = "data/process/simplified_email_voting.bpmn" //procurement_example
  val file = "data/process/peer_review_process.bpmn"

  val is = new FileInputStream(file)
  val Parser = new bpmn_parser(is)
  val report = Parser.fullFromInputStream
  val initial = Parser.initial_state

  println(report)
  println(initial)
}
