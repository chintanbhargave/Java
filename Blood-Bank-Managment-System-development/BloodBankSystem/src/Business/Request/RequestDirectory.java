/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.Request.Request.Status;
import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class RequestDirectory {

    private ArrayList<Request> requestList;

    public RequestDirectory() {

        this.requestList = new ArrayList();
    }

    public ArrayList<Request> getRequestList() {

        return requestList;
    }

    public void addRequest(Request request) {

        requestList.add(request);
    }

    public Request getRequest(int id) {

        for (Request r : requestList) {

            if (r.getId() == id) {

                return r;
            }
        }
        return null;
    }

    public ArrayList<Request> getRequestByDrId(int drId) {
        ArrayList<Request> drReq = new ArrayList();

        for (Request r : requestList) {

            if (r.getDoctorId() == drId) {

                drReq.add(r);
            }
        }
        return drReq;
    }

    public ArrayList<Request> getRaisedReq() {

        ArrayList<Request> reqRaised = new ArrayList();

        for (Request r : requestList) {
            if (r.getStatus() == Status.Raised) {
                reqRaised.add(r);
            }
        }
        return reqRaised;
    }

    public ArrayList<Request> getForwardedReq() {
        ArrayList<Request> reqFwd = new ArrayList();
        for (Request r : requestList) {
            if (r.getStatus() == Status.Forwarded) {
                reqFwd.add(r);
            }
        }
        return reqFwd;
    }

    public ArrayList<Request> getActiveReq() {
        ArrayList<Request> reqAct = new ArrayList();
        for (Request r : requestList) {
            if (r.getStatus() == Status.Active) {
                reqAct.add(r);
            }
        }
        return reqAct;
    }

    public ArrayList<Request> getAssigned() {
        ArrayList<Request> reqAssgn = new ArrayList();
        for (Request r : requestList) {
            if (r.getStatus() == Status.Assigned) {
                reqAssgn.add(r);
            }
        }
        return reqAssgn;
    }

    public ArrayList<Request> getAccepted() {
        ArrayList<Request> reqAcc = new ArrayList();
        for (Request r : requestList) {
            if (r.getStatus() == Status.Accepted) {
                reqAcc.add(r);
            }
        }
        return reqAcc;
    }

    public ArrayList<Request> getCompleted() {
        ArrayList<Request> reqCmp = new ArrayList();
        for (Request r : requestList) {
            if (r.getStatus() == Status.Completed) {
                reqCmp.add(r);
            }
        }
        return reqCmp;
    }

}
