package cts.ems.controller;

import cts.ems.dto.Notification;
import cts.ems.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
//import cts.ems.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/napi")
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification.getUserId(), notification.getEventId(), notification.getMessage());
    }

    @GetMapping("/napi")
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }

    @PostMapping("/notifyUser")
    public void notifyUserAboutEvent(@RequestParam Long userId, @RequestParam Long eventId, @RequestParam String eventDetails) {
        notificationService.notifyUserAboutEvent(userId, eventId, eventDetails);
    }

    @PostMapping("/sendReminder")
    public void sendReminderForUpcomingEvent(@RequestParam Long userId, @RequestParam Long eventId, @RequestParam String eventDetails) {
        notificationService.sendReminderForUpcomingEvent(userId, eventId, eventDetails);
    }
}
