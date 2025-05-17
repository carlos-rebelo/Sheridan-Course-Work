import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-c2',
  imports: [],
  templateUrl: './c2.component.html',
  styleUrl: './c2.component.css'
})
export class C2Component {
  @Output() c2Message = new EventEmitter();
  c2Data = {fname: 'Carlos', lname: 'Rebelo'};
  sendMsg() {this.c2Message.emit(this.c2Data);}
}
