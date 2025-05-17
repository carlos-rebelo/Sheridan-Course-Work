import { Injectable } from '@angular/core';
import { Pdata } from './interfaces/pdata';
import { PDATA } from 'src/assets/data/pData';

@Injectable({
  providedIn: 'root'
})
export class GetdataService {

  constructor() { }

  loadData():Pdata {
    return PDATA;
  }
}
